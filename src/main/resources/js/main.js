var pokerApp = angular.module('pokerApp', []);

pokerApp.controller('mainController', function MainController() {
    this.hello = 'abracadabra';
    this.louder = function () {
        this.hello += '!!!';
    };
});

pokerApp.controller('secondController', function () {

});