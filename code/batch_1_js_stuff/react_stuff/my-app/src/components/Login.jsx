import React, { Component } from 'react';

class Login extends Component {
    constructor(props){
        super(props)

         const {loginStatus, username, password}=props;
        this.state={
            isLoggedInUser:loginStatus,
            username:username,
            password: password
        }
    }
    render() {
        let message
         if(this.state.isLoggedInUser){
            message=<div>welcome logged in user</div>
         }else{
            message=<div>U are  not logged in user</div>
         }
        return message
    }
}

export default Login;