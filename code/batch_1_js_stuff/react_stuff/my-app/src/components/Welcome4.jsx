import React, { Component } from 'react';

class Welcome4 extends Component {
    clickMe(){
        alert('i am clicked...')
    }
    render() {
        return (
            <div>
                <button onClick={()=> this.clickMe()}>click me</button>
            </div>
        );
    }
}

export default Welcome4;