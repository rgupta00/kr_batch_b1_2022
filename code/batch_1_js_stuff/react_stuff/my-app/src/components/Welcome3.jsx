import React from 'react';

function Welcome3(props) {
    function clickMe(){
        alert('you have clicked me')
    }
    return (
        <div>
            <div>
                <h3>{props.name}</h3>
                <button onClick={()=> clickMe()}>click</button>
            </div>
        </div>
    );
}

export default Welcome3;