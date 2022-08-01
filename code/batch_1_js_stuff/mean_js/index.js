
var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var mongoose = require('mongoose');
var Book = require('./Book.model');

var port = 8080;
var db = 'mongodb://localhost/batchb1'

mongoose.connect(db, { useNewUrlParser: true, useUnifiedTopology: true });

app.use(bodyParser.json())

app.use(bodyParser.urlencoded({
    extended: true
}));

app.get('/', function (req, res) {
    res.send('happy to be here');
});

//----------create a routes to get a book-------

app.get('/book/:id', function (req, res) {
    Book.findOne({
        _id: req.params.id
    }).exec(function (err, book) {
        if (err)
            res.send('some error happens')
        else if (book == null) {
            res.send(404)
        } else
            res.json(book);
    })
})

app.delete('/book/:id', function (req, res) {
    Book.findByIdAndRemove({
        _id: req.params.id
    }).exec(function (err, book) {
        if (err)
            res.send('some error happens')
        else {
            console.log(` deleted book id ${book._id}`)
            res.send(204)
        }
    })
})

app.get('/book', function (req, res) {
    Book.find({}).exec(function (err, books) {
        if (err)
            res.send('some error happens')
        else
            res.json(books);
    })
})

app.post('/book', function (req, res) {
    Book.create(req.body, function (err, addedBook) {
        if (err)
            res.send('some error while adding the book to the db')
        else {
            res.status(201).send(addedBook)
        }
    })
})

app.put('/book/:id', function(req, res) {
    Book.findOneAndUpdate({
      _id: req.params.id
      },
      { $set: { title: req.body.title }
    }, function(err, newBook) {
      if (err) {
        console.log(err)
        res.send('error updating ');
      } else {
        console.log(newBook);
        res.send(newBook);
      }
    });
  });



app.listen(port, function () {
    console.log('app listening on port ' + port);
});