import React from 'react';
import List from './List';

function Lists(props) {
    const emps=[{id:1,name:"raj",salary:65656},
    {id:2,name:"seema",salary:55656},
    {id:3,name:"ekta",salary:60656}
    ]

    return (
        <div>
            {emps.map(emp=><List key={emp.id} emp={emp}/>)}
        </div>
    );
}

export default Lists;