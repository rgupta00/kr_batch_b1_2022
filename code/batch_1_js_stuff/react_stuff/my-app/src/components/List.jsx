import React from 'react';

function List({emp}) {
    return (
        <div>
            <li>{emp.id},{emp.name},{emp.salary}</li>
        </div>
    );
}

export default List;