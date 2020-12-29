const newman = require('newman');

let errorFlag = false;
newman.run({
    collection: require('./test_collection.json'),
    reporters: 'cli',
    bail: true
}).on('done', (err, summary) => {
    if(err || summary.run.failures.length){
        console.log(err);
        proces.exit(1);
    } else{
        process.exit(0);
    }
});
