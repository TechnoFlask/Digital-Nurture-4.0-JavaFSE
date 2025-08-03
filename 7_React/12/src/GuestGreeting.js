import { LoginButton } from "./LoginButton"

export function GuestGreeting({ onClick }) {
     return <div>
          <h1>
               Please sign up.
          </h1>
          <LoginButton onClick={onClick} />
     </div>
}