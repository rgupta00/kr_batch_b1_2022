import React, { Component } from 'react';
import EmployeeService from '../services/EmployeeService';

class EmpList extends Component {

    constructor(props) {
        super(props)
        this.state = {
            employees: []
        }
    }

    componentDidMount() {
        EmployeeService.getEmployees().then((res) => {
            this.setState({ employees: res.data })
        })
    }
    render() {
        return (
            <div>
            <h2 className="text-center">Employees List</h2>
            <div className = "row">
                   <table className = "table table-striped table-bordered">

                       <thead>
                           <tr>
                               <th> Employee id</th>
                               <th> Employee Name</th>
                               <th> Employee Salary</th>
                           </tr>
                       </thead>
                       <tbody>
                           {
                               this.state.employees.map(
                                   employee => 
                                   <tr key = {employee.id}>
                                        <td> { employee.id} </td>   
                                        <td> { employee.name} </td>   
                                        <td> {employee.salary}</td>
                                   </tr>
                               )
                           }
                       </tbody>
                   </table>

            </div>

       </div>
        );
    }
}

export default EmpList;