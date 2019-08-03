TOKEN=$(curl 'http://api.dev.devopseasy.com/oauth/oauth/token?client_id=client&client_secret=secret&grant_type=password&password=YWRtaW4%3D&username=admin' -X POST -H 'Accept: application/json, text/plain, */*'|awk -F '"' '{print $4}')

value=1

echo "开始获取组织id为1的信息,并放入数据库";
curl -X GET \
  http://localhost:8080/studys/v1/organizations/$value/create \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H "Authorization: Bearer  $TOKEN" \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -H 'Cookie: JSESSIONID=129C8B4C6AB026305E6F2064A6412693' \
  -H 'Host: localhost:8080' \
  -H 'Postman-Token: 08a791d2-2773-4a32-a0f9-e16c73fe7637,86db6c91-5feb-4ae7-a3f6-7934d7b05762' \
  -H 'User-Agent: PostmanRuntime/7.15.2' \
  -H 'cache-control: no-cache'

echo "=============="

echo "从数据库获取id为一的组织信息";
curl -X GET \
  http://localhost:8080/studys/v1/organizations/$value \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H "Authorization: Bearer  $TOKEN" \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -H 'Cookie: JSESSIONID=129C8B4C6AB026305E6F2064A6412693' \
  -H 'Host: localhost:8080' \
  -H 'Postman-Token: 08a791d2-2773-4a32-a0f9-e16c73fe7637,5c2e5894-fb17-4dc4-a12a-7b124721d746' \
  -H 'User-Agent: PostmanRuntime/7.15.2' \
  -H 'cache-control: no-cache'

  echo "=============="
  echo "开始获取组织id为1,用户id为1的信息,并放入数据库";
  curl -X GET \
  "http://localhost:8080/studys/v1/users/create?id=$value&organization_id=$value" \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H "Authorization: Bearer  $TOKEN" \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Cookie: JSESSIONID=129C8B4C6AB026305E6F2064A6412693' \
  -H 'Host: localhost:8080' \
  -H 'Postman-Token: 8ef6dd8d-faa7-413e-b1c9-70bb4839ab17,dd984052-7aba-46b8-9c30-06cf4f9086eb' \
  -H 'User-Agent: PostmanRuntime/7.15.2' \
  -H 'cache-control: no-cache'