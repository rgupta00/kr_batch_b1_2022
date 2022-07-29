//call a api
//https://api.github.com/users

//define a function

async function getData(){

    const response= await fetch('https://api.github.com/users')
    const users= await response.json()
    return users
}

let val= getData();
console.log(a)