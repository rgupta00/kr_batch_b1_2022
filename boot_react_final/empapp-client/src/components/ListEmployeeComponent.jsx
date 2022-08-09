import React, { useState } from 'react'
import { useEffect } from 'react';
import { Link } from 'react-router-dom';
import EmployeeService from '../services/EmployeeService';

const ListEmployeeComponent = () => {
 
const [employees, setEmployees] = useState([])

useEffect(() => {
    getAllEmployees();
}, [])

const deleteEmployee = (employeeId) => {
    EmployeeService.deleteEmployee(employeeId).then((response) =>{
     getAllEmployees();

    }).catch(error =>{
        console.log(error);
    })
     
}
const getAllEmployees = () => {
    EmployeeService.getEmployees().then((response) => {
        setEmployees(response.data)
        console.log(response.data);
    }).catch(error =>{
        console.log(error);
    })
}

return (
    <div className="container">
        <h2 className="text-center"> List Employees </h2>
        <Link to = "/add-employee" className = "btn btn-primary mb-2" > Add Employee </Link>
        <table className="table table-striped table-bordered">
            <thead>
                <tr>
                    <th> Employee id</th>
                    <th> Employee Name</th>
                    <th> Employee Salary</th>
                </tr>
            </thead>
            <tbody>
                {
                    employees.map(
                        employee =>
                            <tr key={employee.id}>
                                <td> {employee.id} </td>
                                <td> {employee.name} </td>
                                <td> {employee.salary}</td>
                                <button className = "btn btn-danger" onClick = {() => deleteEmployee(employee.id)} style = {{marginLeft:"10px"}}> Delete</button>
                                <Link className="btn btn-info" to={`/edit-employee/${employee.id}`} >Update</Link>
                            </tr>
                    )
                }
                
            </tbody>
        </table>
    </div>
)
}

export default ListEmployeeComponent