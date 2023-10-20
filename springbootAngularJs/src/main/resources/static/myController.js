

angular.module('myApp').controller('myController', function ($scope,$http) {
    $scope.cars = [
        { id: 1, name: 'Car 1', description: 'Description 1' },
        { id: 2, name: 'Car 2', description: 'Description 2' },
        { id: 3, name: 'Car 3', description: 'Description 3' }
    ];

    $scope.currentCar = {};

    $scope.addCar = function() {
        if ($scope.currentCar.id) {
            // Update an existing car
            $http.put('/cars/' + $scope.currentCar.id, $scope.currentCar)
                .then(function(response) {
                    // Handle the response as needed
                    var updatedCar = response.data;
                    var index = $scope.cars.findIndex(function(car) {
                        return car.id === updatedCar.id;
                    });
                    if (index !== -1) {
                        $scope.cars[index] = updatedCar;
                    }
                })
                .catch(function(error) {
                    // Handle errors, e.g., display an error message
                });
        } else {
            // Add a new car
            $http.post('/cars/', $scope.currentCar)
                .then(function(response) {
                    // Handle the response as needed
                    $scope.cars.push(response.data);
                })
                .catch(function(error) {
                    // Handle errors, e.g., display an error message
                });
        }
        
        // Clear the form
        $scope.currentCar = {};
    };
    
    
    $scope.editCar = function(car) {
        // Set the current car for editing
        $scope.currentCar = angular.copy(car);
    };

    $scope.deleteCar = function(car) {
        // Delete a car (you can implement this logic)
        // Handle the response as needed
        var index = $scope.cars.indexOf(car);
        $scope.cars.splice(index, 1);
    };
});
