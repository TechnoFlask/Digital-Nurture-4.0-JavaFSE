import { LogoutButton } from "./LogoutButton"

export function UserGreeting({ onClick }) {
     return <div>
          <h1>
               Welcome back
          </h1>
          <LogoutButton onClick={onClick} />
     </div>
}