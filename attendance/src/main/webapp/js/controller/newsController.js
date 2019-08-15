 //控制层 
app.controller('newsController' ,function($scope,$controller   ,newsService,uploadService){
	
	$controller('baseController',{$scope:$scope});//继承
	
	//查询实体 
	$scope.findOne=function(id){				
		newsService.findOne(id).success(
			function(response){
				$scope.entity= response;
				$scope.picUrl = response.spare0;
			}
		);				
	}
	

	//保存
	// $scope.save=function(){
	// 		newsService.add( $scope.entity ).success(
	// 		function(response){
	// 			if(response.success){
	// 				//重新查询
	// 				$scope.reloadList();//重新加载
	// 			}else{
	// 				alert(response.message);
	// 			}
	// 		}
	// 	);
	// }
	$scope.save=function(){
		var serviceObject;//服务层对象

		if($scope.entity.id!=null){//如果有ID

			serviceObject=newsService.update( $scope.entity ); //修改
		}else{

			serviceObject=newsService.add( $scope.entity  );//增加
		}
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询
		        	$scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}
		);
	}
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		newsService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象
	
	//搜索
	$scope.search=function(page,rows){			
		newsService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}

	$scope.picUrl="";  //存放图片  每条新闻不能超过四张图片

	$scope.uploadFile = function(){
		// 调用uploadService的方法完成文件的上传
		uploadService.uploadFile().success(function(response){
			if(response.flag){
				// 获得url
				$scope.picUrl =  response.message;
				$scope.entity.spare0 =  response.message;
			}else{
				alert(response.message);
			}
		});
	}
    
});	
