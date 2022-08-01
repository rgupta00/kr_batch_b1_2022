//i want to write a hello world server
let express= require('express')
let app=express();

app.get("/", function(req, resp){
    resp.send('hello to all from express')
})

//filter is used to protect the servlet api*
//we can configure some handler function that can run before the routes..
// even we can configure chain of handline
//i want to do loggin before any req for route is done
let urlChecker= function(req, resp, next){
    console.log('urlChecker url requrest is : '+req.originalUrl);
    next();
}

let urlChecker2= function(req, resp, next){
    console.log('urlChecker2 url requrest is : '+req.originalUrl);
    next();
}

//app.use(urlChecker);

app.get("/admin",[urlChecker2 , urlChecker] ,function(req, resp){
    resp.send('admin')
})

app.get("/user", function(req, resp){
    resp.send('user')
})

app.listen(3500);
console.log('working...')