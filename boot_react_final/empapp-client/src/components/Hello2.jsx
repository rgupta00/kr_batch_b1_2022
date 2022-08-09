import React, { useEffect } from 'react'
import { useState } from 'react'

const Hello2 = () => {
    //i want to use useState to maintain the counter 0--> max
    //-----------------------------------------------100-> 0
    const [count1, setCount1] = useState(0);

    const [count2, setCount2] = useState(100);

    useEffect(()=>{
        console.log('use effect is called. after mount update ..and unmount..')
    },[count1, count2])
    const handleIncrement = () => {
        setCount1(count1 + 1)
    }
    const handleDecrement = () => {
        setCount2(count2 - 1)
    }


    return (
        <div>

handleIncrement:  <div>{count1}</div> <br />
handleDecrement:  <div>{count2}</div> <br />
            <button type='button' onClick={handleIncrement}>handleIncrement</button><br/>
            <button type='button' onClick={handleDecrement}>handleDecrement</button>

        </div>
    )
}

export default Hello2