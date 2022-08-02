import React, { Component } from 'react';

class First extends Component {
    //in order to use the state we can user a property 
    //that is called state and it is avalible on this
   constructor(props){
        super(props)
        this.state={
            name: 'raja',
            age:35
        }
   }

   changeStateFoo(){
    //this.state.age=40;
   // console.log(this.state.age)
    this.setState({name:'java dev', age: this.state.age+1}, ()=>console.log(this.state.age)
    )
   
   }
   
    render() {
        return (
            <div>
                {this.state.name} ,{this.state.age} <br/>
                <button onClick={()=> this.changeStateFoo()}>change it</button>
            </div>
        );
    }
}

export default First;