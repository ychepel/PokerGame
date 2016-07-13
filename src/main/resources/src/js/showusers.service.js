pokerApp.factory('showUsersService', function ($http, $q) {

    let promise;

    return {
        getUsers
    };

    function getUsers() {
        if (!promise) {
            promise = $http.get('/user-table')
                .then(function (response) {
                    return response.data;
                });
        }
        return promise;
    }
});

