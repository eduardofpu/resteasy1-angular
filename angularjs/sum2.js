

angular.module('sum2', [])
  .controller('CONTROLLER', function($scope, $http) {
    $scope.calcular = function(value1, value2) {
      var Params = {
        method: 'POST',
        url: 'http://localhost:8080/service/math/ex2',
        headers: { 'Content-Type': 'application/json' },
        data: { 'requestSubtrairBean': { 'value1':value1, 'value2':value2 }}
      };

      $http(Params).then(function(evt) {
        $scope.valor = evt.data.responseSubtrairBean.result;
      });
    };

  });
