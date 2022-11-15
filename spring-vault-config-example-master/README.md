# spring-vault-config
Download and setup vault on your host
Learn more from https://www.youtube.com/watch?v=n0kmSftlesE

# write : 
vault kv put secret/spring-vault-config justice.username=jay justice.password=jay

# read : 
vault kv get secret/spring-vault-config

# Delete: 
vault kv delete secret/spring-vault-config
