package script.db

databaseChangeLog(logicalFilePath:'users.groovy'){
    changeSet(id:'2019-8-3-users',author:'ztxemail@163.com'){
        createTable(tableName:'tb_users') {
            column(name: 'ID', type: 'BIGINT UNSIGNED', remarks: 'ID', autoIncrement: true) {
                constraints(primaryKey: 'true')
            }
            column(name: 'LOGIN_NAME', type: 'VARCHAR(32)', remarks: '登录名')
            column(name: 'EMAIL', type: 'VARCHAR(32)', remarks: '邮箱')
            column(name: 'ORGANIZATION_ID', type: 'BIGINT', remarks: '组织ID')
        }
    }
}