const newman = require('newman');

newman.run({
    collection: require('./test_collection.json'),
    reporters: 'cli',
    bail: true
}, function (err) {
    if (err) { throw err; }
    console.log('collection run complete!');
});
