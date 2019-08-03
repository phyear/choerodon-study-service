package script.db
databaseChangeLog(logicalFilePath:'project.groovy'){
    changeSet(id:'2019-8-3-project',author:'ztxemail@163.com'){
        createTable(tableName:'tb_project'){
            column(name:'ID',type:'BIGINT UNSIGNED',remarks: 'ID', autoIncrement: true){
                constraints(primaryKey:'true')
            }
            column(name:'NAME',type:'VARCHAR(32)',remarks: '项目名')
            column(name:'CODE',type:'VARCHAR(15)',remarks: 'code')
            column(name: 'ORGANIZATION_ID', type: 'BIGINT', remarks: '组织ID')


        }
    }

}
