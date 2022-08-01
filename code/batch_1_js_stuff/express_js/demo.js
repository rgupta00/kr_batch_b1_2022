//i want to write a hello world server
let express= require('express')
let app=express();

app.get("/", function(req, resp){
    resp.send('hello to all from express')
})

//routing parameter
// emp3?empId=111&deptId=2


//PathVaraible ?
app.get("/emp3", function(req, resp){
    resp.send(req.query)
})


//routing parameter
// emp2/111/dept/10


//RequestParameter :how to get it in expess
app.get("/emp2/:empId/dept/:dept", function(req, resp){

    resp.send(req.params.empId)
})


app.get("/emp", function(req, resp){
    resp.send('emp')
})
app.get("/admin", function(req, resp){
    resp.send('admin')
})

app.get("/home", function(req, resp){
    resp.send('home')
})

app.get("/abc*pqr", function(req, resp){
    resp.send('home')
})

app.listen(3500);
console.log('working...')