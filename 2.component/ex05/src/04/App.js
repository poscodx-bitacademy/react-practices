import React, {useState, useEffect} from 'react';
import './assets/scss/App.scss'
import Clock from './Clock';

export default function App() {
    const [ticks, setTicks] = useState(0);

    steInterval(() => {
        setTicks(ticks+1);
    }, 1000);

    return (
        <>
            <span>{ticks}</span>
            <Clock
                message={'ex05: useEffect Hook example'}
                hours={15}
                minutes={5}
                seconds={2}/>
        </>        
    );
}