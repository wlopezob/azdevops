# CI-CD Azure Devops - EKS

Este repositorio contiene un pequeño ejemplo con spring boot, vamos a desplegar la aplicacion en Amazon-EKS
  

## AzureDevops - Pipelines: Instalar las siguientes extensiones
1. [AWS Toolkit for Azure DevOps](https://marketplace.visualstudio.com/items?itemName=AmazonWebServices.aws-vsts-tools)
2. [Replace Tokens](https://marketplace.visualstudio.com/items?itemName=qetza.replacetokens)
3. [Sonarqube](https://marketplace.visualstudio.com/items?itemName=SonarSource.sonarqube)

## Azure Pipelines: Crear variables:
1. kube_config: contiene el valor base64 del archivo kube.config
```
cat ~/.kube/config | base64 > base64.txt
//copiar el contenido del archivo base64.txt (borrar espacio en blancos)
```