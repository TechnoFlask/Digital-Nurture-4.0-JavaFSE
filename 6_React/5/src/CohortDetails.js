import styles from "./CohortDetails.module.css"

export function CohortDetails() {
     const cohorts = [{
          name: "INTADMDF10 -.NET FSD",
          startedOn: "22-Feb-2022",
          status: "Scheduled",
          coach: "Aathma",
          trainer: "Jojo Jose"
     }, {
          name: "ADM21JF014 -Java FSD",
          startedOn: "10-Sep-2021", status: "Ongoing", coach: "Apoorv", trainer: "Elisa Smith"
     }, {
          name: "CDBJF21025 -Java FSD",
          startedOn: "24-Dec-2021", status: "Ongoing",
          coach: "Aathma",
          trainer: "John Doe"
     }]

     return <dt className={styles.dt}>
          <h1>
               Cohorts Details
          </h1>
          <div>
               {cohorts.map(c => (
                    <div className={styles.box}>
                         <h3 style={{ color: c.status === "Scheduled" ? "blue" : "green" }}>{c.name}</h3>
                         <div style={{ display: "flex", flexDirection: "column" }}>
                              <b>Started On</b>
                              <p>&nbsp;&nbsp;&nbsp;&nbsp;{c.startedOn}</p>
                              <b>Current Status</b>
                              <p>&nbsp;&nbsp;&nbsp;&nbsp;{c.status}</p>
                              <b>Coach</b>
                              <p>&nbsp;&nbsp;&nbsp;&nbsp;{c.coach}</p>
                              <b>Trainer</b>
                              <p>&nbsp;&nbsp;&nbsp;&nbsp;{c.trainer}</p>
                         </div>
                    </div>
               ))}
          </div>
     </dt>
}