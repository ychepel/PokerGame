pokerApp.component('home', {
    templateUrl: 'fragments/home.html',
    controller: function(userService) {
        if(userService.getName()) {
            this.username = userService.getName();
        }
        else {
            this.username = 'Guest';
        }
    }
});