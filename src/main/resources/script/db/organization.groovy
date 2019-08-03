package script.db
databaseChangeLog(logicalFilePath:'organization.groovy'){
    changeSet(id:'2019-8-3-organization',author:'ztxemail@163.com'){
        createTable(tableName:'tb_organization'){
            column(name:'ID',type:'BIGINT UNSIGNED',remarks: 'ID', autoIncrement: true){
                constraints(primaryKey:'true')
            }
            column(name:'NAME',type:'VARCHAR(32)',remarks: '组织名')
            column(name:'CODE',type:'VARCHAR(15)',remarks: '组织Code')
            column(name: 'USER_ID',type: 'BIGINT',remarks: '用户id')
            column(name: 'owner_login_name',type: 'VARCHAR(15)',remarks: '登录名')
            column(name: 'owner_realName',type: 'VARCHAR(15)',remarks: '真实名称')
            column(name: 'owner_phone',type: 'VARCHAR(15)',remarks: '手机号')
            column(name: 'owner_email',type: 'VARCHAR(15)',remarks: '邮箱')
        }
    }

}
