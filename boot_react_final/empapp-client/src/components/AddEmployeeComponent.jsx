import React, { useEffect, useState } from 'react'
import { Link, useHistory, useParams } from 'react-router-dom'
import EmployeeService from '../services/EmployeeService'

const AddEmployeeComponent = () => {
    const [name, setName] = useState('')
    const [salary, setSalary] = useState('')

    const history= useHistory();

    const { id } = useParams(); // used t extract the parameters

    useEffect(() => {
        EmployeeService.getEmployeeById(id).then((response) => {
            console.log('---------id---------')
            console.log(id)
            setName(response.data.name)
            setSalary(response.data.salary)
        }).catch(err => {
            console.log(err)
        })

    }, [])

    const title=()=>{
        if(id){
            return <h2>Update Employee</h2>
        }else{
            return <h2>Add Employee</h2>
        }
    }

    const saveOrUpdateEmployee = (e) => {
        e.preventDefault();
        const employee={name,salary}
        // console.log(employee)
        //now call ajax 
       
        if(id){
            EmployeeService.updateEmployee( employee, id).then((response) => {
                history.push('/employees')
            }).catch(error => {
                console.log(error)
            })

        }else{
            EmployeeService.createEmployee(employee).then((response) =>{

                console.log(response.data)
    
                history.push('/employees');
    
            }).catch(error => {
                console.log(error)
            })
        }
        history.push('/employees')
    }

  return (
    <div>
 <div>
            <div className="container">
                <div className="row">
                    <div className="card col-md-6 offset-md-3 offset-md-3">
                         {title()}
                        <div className="card-body">
                            <form>
                                <div className="form-group mb-2">
                                    <label className="form-label">  Name :</label>
                                    <input
                                        type="text"
                                        placeholder="Enter name"
                                        name="name"
                                        className="form-control"
                                        value={name}
                                        onChange={(e) => setName(e.target.value)}
                                    >
                                    </input>
                                </div>

                                <div className="form-group mb-2">
                                    <label className="form-label"> Salary :</label>
                                    <input
                                        type="text"
                                        placeholder="Enter Salary"
                                        name="salary"
                                        className="form-control"
                                        value={salary}
                                        onChange={(e) => setSalary(e.target.value)}
                                    >
                                    </input>
                                </div>
                                <button className="btn btn-success" onClick={(e) => saveOrUpdateEmployee(e)} >Submit </button>
                                <Link to="/employees" className="btn btn-danger"> Cancel </Link>
                            </form>

                        </div>
                    </div>
                </div>

            </div>
        </div>

    </div>
  )
}

export default AddEmployeeComponent