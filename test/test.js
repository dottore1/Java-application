const newman = require('newman');

let errorFlag = false;
newman.run({
    collection: require('./test_collection.json'),
    reporters: 'cli',
    bail: true
}).on('done', (err, summary) => {
    if(err || summary.run.failures.length){
      const failureCount = summary.run.failures.length;
      summary.run.failures.forEach((element, index) => {
        const header = `${'='.repeat(32)}[ Error-${index + 1} ]${'='.repeat(32)}`;
         console.error(header);
        console.error('Tag      :', element.parent.name);
        console.error('Source   :', element.source.name);
        console.error('Type     :', element.error.name);
        console.error('Test     :', element.error.test);
         console.error('Error    :', element.error.message);
      if (index === failureCount - 1) console.error('~'.repeat(header.length));
    });
    console.error(treeify.asTree(summary.run.stats, true));
    process.exit(1);
    } else{
        process.exit(0);
    }
});
