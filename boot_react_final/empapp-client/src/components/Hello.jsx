import React from 'react'
import { useState } from 'react'

const Hello = () => {
    // data     funcation, array destructing ES6
   const [name,setName]=useState("raj");
   const [marks,setMark]=useState(90);

    const handleClick=()=>{
        setName("java trainer")
        setMark(94)
    }
  return (
    <div>
        <div>{name}</div> <br/>
        <div>{marks}</div> <br/>
        <button type='button' onClick={handleClick}>click me</button>
    </div>
  )
}

export default Hello