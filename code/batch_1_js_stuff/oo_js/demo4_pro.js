//promise 1. pending 2. resole and 3. receted

//clean the room , remove the garbage and get the icecreaam or error

let cleanRoom= function(){
    return new Promise(function(resolve, reject){
        resolve('clean the room...')
    })
}
let removeTheGarbage= function(){
    return new Promise(function(resolve, reject){
        resolve('garbage is removed ')
    })
}

let wonTheIceCream= function(){
    return new Promise(function(resolve, reject){
        resolve('wonTheIceCream')
    })
}

//async and await

//how to use it
console.log('start')
const result=async ()=>{
    console.log('1')
    const result1= await cleanRoom();
    console.log('2')
    const result2= await removeTheGarbage();
    console.log('3')
    const result3= await wonTheIceCream();
    console.log('4')
    return result3;
}

console.log('end')
result().then(result=>console.log(result)).catch(err=> console.log(err))
console.log('done')



// console.log('hi')
// cleanRoom().then(function(result){
//     return removeTheGarbage(result)
// }).then(function(result){
//     return wonTheIceCream(result)
// }).then(function(result){
//     console.log('done')
// }).catch(function(fromReject){
//     console.log('rejected')
// })
// console.log('hello')