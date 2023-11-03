import React from 'react';
import styles from './assets/scss/Card.scss';
import TaskList from './TaskList';

const Card = ({no, title, description, tasks}) => {

    return (
        <div className={styles.Card}>
            <div className={styles.Card__Title}>
                {title}
            </div>            
            <div className={styles.Card__Details}>
                {description}
                <TaskList tasks={tasks}/>
            </div>
        </div>
    );
};

export default Card;