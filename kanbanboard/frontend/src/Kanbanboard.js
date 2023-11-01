import React from 'react';
import data from './assets/json/data';

function Kanbanboard(props) {

    const cardsToDo = data.filter(card => card.status === 'ToDo');
    console.log(cardsToDo);

    return (
        <div>
            Kanbanboard
        </div>
            
        
    );
}

export default Kanbanboard;