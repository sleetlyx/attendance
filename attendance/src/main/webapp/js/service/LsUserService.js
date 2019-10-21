//服务层
app.service('lsuserService',function($http){

	this.findBybadge = function(search){
		return $http.post('../emp/findBybadge.do',search);
	}


	//查询实体
	this.findOne=function(id,wxCode){
		return $http.get('../emp/findOne.do?empId='+id);
	}

	//搜索
	this.search=function(searchEntity){
		return  $http.post('../emp/findBybadge.do',searchEntity);
	}

	//接触绑定
	this.updateByEmpid = function (empid) {
		return $http.get('../emp/updateByEmpid.do?empid='+empid);
	}
	//
	this.updateDeptId = function (empid,deptid) {
		return $http.get('../emp/updateEmpDeptId.do?empid='+empid+'&deptid='+deptid);
	}
	this.updateEmp = function(empid){
		return $http.get('../emp/updateEmpState.do?empid='+empid);
	}
});
