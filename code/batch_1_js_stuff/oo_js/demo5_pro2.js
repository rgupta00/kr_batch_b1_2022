//some more ex

// const cal=(a,b)=>{
//     return new Promise((res, rej)=>{
//         setTimeout(() => {
//             res(a+b)
//         }, 1000);
//     })
// }

const cal = (a, b) => {
    return new Promise((res, rej) => {
        setTimeout(() => {
            if (a < 0 || b < 0) {
                return rej("it is not allowed")
            } else
                res(a + b)

        }, 100);
    })
}
console.log('start')
const resultVal=async ()=>{
    console.log('1')
    const val1=await cal(1,2)
    console.log('2')
    const val2=await cal(val1,20)
    console.log('3')
    const val3=await cal(val2,-6)
    console.log('4')
    return val3;
}

resultVal().then(val=> console.log(val))
    .catch(e=> console.log(e))

console.log('end')

//1,2 => res, 20=> res, 30
