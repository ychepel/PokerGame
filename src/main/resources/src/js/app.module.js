const pokerApp = angular.module('pokerApp', ['ngRoute', 'ngCookies']);

pokerApp.config(function Config($routeProvider, $locationProvider) {
    $locationProvider.html5Mode(true);

    $routeProvider.
        when('/', {
            template: '<home></home>'
        }).
        when('/home', {
            template: '<home></home>'
        }).
        when('/login', {
            template: '<login-form></login-form>'
        }).
        when('/signup', {
            template: '<signup-form></signup-form>'
        }).
        when('/highscores', {
            template: '<highscores></highscores>'
        }).
        when('/playgame', {
            template: '<play-game></play-game>'
        }).
        otherwise({
            templateUrl: 'fragments/404.html'
        });
});