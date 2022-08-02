import axios from "axios";
//const { URL } = process.env;
const URL='http://localhost:8082/empapp/employees';
class EmployeeService{

    
    getEmployees(){
        return axios.get(URL)
    }

}
export default new EmployeeService();