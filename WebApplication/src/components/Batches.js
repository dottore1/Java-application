import React, { Component } from 'react'

export class Batches extends Component {
    //State contains all the variables of the class
    

    state = {
        searchVar: "",
        selectedBatchID: "",
        selectSuccess: false,
        errorMessage: "",
        link: "",
        Pagebatches: []
    };

    search = (e) => {
        fetch('http://localhost:8080/api/batches/' + document.getElementById("searchField").value)
            .then(response => {
                let json = response.json();
                json.then(data => {
                    if (response.status === 200) {
                        this.setState({ selectedBatchID: data.id, selectSuccess: true, errorMessage: "", link: "http://localhost:8080/api/batches/" + data.id + "/get-report"});
                    } else if (response.status === 400) {
                        this.setState({ selectedBatchID: "", selectSuccess: false, errorMessage: "Something went wrong, have you entered a valid UUID?", link: "" })
                    } else {
                        this.setState({ selectedBatchID: "", selectSuccess: false, errorMessage: data.response, link: "" });
                    }
                })
            }
            )

    }

    change = (e) => {
        
    }



    generatePDF = (e) => {
        window.location.href = this.state.link;
    }

    render() {
        let selectedBatchMessage;
        let errorMessage;

        if (this.state.selectSuccess) {
            selectedBatchMessage = <p>Selected batch: {this.state.selectedBatchID}</p>
            errorMessage = <p></p>
        } else {
            selectedBatchMessage = <p>Selected batch: none</p>
            errorMessage = <p style={{ color: "red" }}>{this.state.errorMessage}</p>
        }

        return (
            <div>
                <div>
                    {selectedBatchMessage}
                </div>
                <div>
                    {errorMessage}
                </div>
                <div>
                    <input id="searchField" placeholder="Batch ID"></input>
                    <button onClick={this.search}>Search</button>
                </div>
                <div>
                    {this.state.selectSuccess === true ? (<button onClick={this.generatePDF}>Generate Report</button>) : (<p></p>)}
                </div>
                <select 
                        size="10"
                        onChange={this.change}
                >
                    {this.state.machines.map((option) => (
                        <option 
                            value={JSON.stringify(option)}
                            key={option.value}
                        >
                            {option.label} 
                        </option>
                    ))}
                </select>
            </div>
        )
    }
}

export default Batches