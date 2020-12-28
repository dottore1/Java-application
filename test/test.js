const newman = require('newman');

newman.run({
    collection: require('./test_collection.json'),
    reporters: 'cli'
}, function (err) {
    if (err) { throw err; }
    console.log('collection run complete!');
});