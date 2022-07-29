const fs=require('fs')

//i want to write some data to a file
let data="i love teaching and programming";
console.log('start')
fs.writeFile('demo.txt', data, function(err){
    if(err){
        console.log('some error')

        console.log('file is written')
    }
})

console.log('end')
