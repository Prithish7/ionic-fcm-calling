var exec = require('cordova/exec');

var CallPlugin = {
    handleCall: function(successCallback, errorCallback) {
        exec(successCallback, errorCallback, 'CallPlugin', 'handleCall', []);
    }
};

module.exports = CallPlugin;
