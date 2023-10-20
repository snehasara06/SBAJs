
app.service('myService', function($http) {
    // Define service functions to interact with your REST API

    this.getCars = function() {
        return $http.get('http://localhost:9099/cars/allCars');
    };

    this.addCar = function(car) {
        return $http.post('http://localhost:9099/cars/add', car);
    };

    this.updateCar = function(car) {
        return $http.put('http://localhost:9099/cars/update/' + car.id, car);
    };

    this.deleteCar = function(car) {
        return $http.delete('http://localhost:9099/cars/delete/' + car.id);
    };
});
