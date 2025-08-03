import { useState } from "react"
import { GuestGreeting } from "./GuestGreeting"
import { UserGreeting } from "./UserGreeting"

export function Greeting(props) {
     const [loggedIn, setLoggedIn] = useState(false)
     if (loggedIn)
          return <UserGreeting onClick={setLoggedIn.bind(null, false)} />
     return <GuestGreeting onClick={setLoggedIn.bind(null, true)} />
}