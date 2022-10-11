# CI-CD Azure Devops - Maven,CheckStyle,Jacoco,Sonarqube,docker,EKS

Este repositorio contiene un pequeño ejemplo con spring boot, vamos a desplegar la aplicacion en Amazon-EKS
  

## AzureDevops - Pipelines: Instalar las siguientes extensiones
1. [AWS Toolkit for Azure DevOps](https://marketplace.visualstudio.com/items?itemName=AmazonWebServices.aws-vsts-tools)
2. [Replace Tokens](https://marketplace.visualstudio.com/items?itemName=qetza.replacetokens)
3. [Sonarqube](https://marketplace.visualstudio.com/items?itemName=SonarSource.sonarqube)
4. [SonarQube build breaker](https://marketplace.visualstudio.com/items?itemName=SimondeLang.sonar-buildbreaker)

## Descargar kube.config de AWS
```
#listar cluster aws
aws eks list-clusters
#descargar kubeconfig de aws
aws eks update-kubeconfig --name cluster-maderera 
#ver actual contexto
kubectl config current-context
# usar el contexto nuevo
kubectl config use-context cluster-maderera
```
## Azure Pipelines: Crear variables:
1. kube_config: contiene el valor base64 del archivo kube.config
```
cat ~/.kube/config | base64 -w 0 > base64.txt
//copiar el contenido del archivo base64.txt (borrar espacio en blancos)
```
