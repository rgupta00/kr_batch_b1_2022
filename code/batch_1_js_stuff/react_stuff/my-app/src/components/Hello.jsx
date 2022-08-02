import React, { Component } from 'react';

class Hello extends Component {
    render() {
        return (
            
              <React.Fragment>
                  <h3>class component hello</h3>
                  <h3>our motive is : {this.props.motive}</h3>
              </React.Fragment>
            
        );
    }
}

export default Hello;