# 🔧 DevOps

> ⬆️ Main entry: [Study](Study.md)

## 🚀 Features
- **Automationm**
- **CI/CD**
- **Monitoring**
- **Collaboration**
- **Infrastructure as Code**

---

## 🔄 SDLC
- **Requirement gathering**: Interact with the user to understand wht the software should do, features
- **Analysis**: Analyse the requirements and understand how to build the software, roadmap for development
- **Design**: Design the architecture of the software, components, interactions, technologies, ui
- **Coding**: Write the code
- **Testing**: Test the software functionality to ensure it meets the requirements and is free of bugs
- **Deployment**: Deploy the software to a production environment
- **Maintenance**: Ongoing support and maintenance of the software, improvements, bug fixes

---

## 🐳 Docker

### Images
- **build**: docker image build
- **show**: docker image ls
- **pull**: docker image pull name:version
- **inspect**: docker image inspect name
- **delete**: docker image rm

### Containers
- **start**: docker container run
- **stop**: docker container stop id
- **delete**: docker container rm

### Dockerfile

```dockerfile
FROM alpine
RUN apk add update nodejs npm
COPY resources /src
WORKDIR /src
RUN npm install
EXPOSE 8080
ENTRYPOINT ["node","./app.js"]
```

### Docker for Java Applications
- **Image vs container**: The image is the immutable template; the container is a running instance of it
- **Layers and caching**: Each Dockerfile instruction creates a layer; order them from least to most frequently changing so rebuilds reuse the cache
- **Multi-stage builds**: Build with the full Java Development Kit in a first stage, ship only the Java Runtime Environment plus the application in the final stage — much smaller images
- **Spring Boot specifics**: Layered jars (dependencies cached in their own layer, separate from your code), and run as a non-root user

---

## ☸️ Kubernetes

### Structure
Deployment contains > Pods contains > Containers

### Core Objects (from the smallest unit to the entry point)
- **Pod**: Smallest deployable unit; one or more containers sharing network and storage
- **Deployment**: Manages the replicas of a pod; handles rolling updates and rollbacks
- **Service**: Stable network identity in front of ephemeral pods — **ClusterIP** (internal only), **NodePort** (a port opened on every node), **LoadBalancer** (external, cloud-provisioned)
- **Ingress**: HTTP routing rules (host and path based) toward services

### Nodes
- **Master node (control plane)**: Takes decisions about the cluster
- **Worker node**: Carries on work

### Components
- **apiserver**: exposes the interface to communicate with the control plane
- **kubelet**: Main kubernetes agent on each node
- **kube-proxy**: Networking component

### Configuration & Spring Boot Integration
- **ConfigMap** (non-sensitive configuration) and **Secret** (sensitive values) are exposed to pods as environment variables or mounted files — Spring Boot reads them like any other property source
- **Probes wired to Actuator**:
  - **Liveness probe** ("is the process alive?" — Kubernetes restarts the pod on failure) → `/actuator/health/liveness`
  - **Readiness probe** ("can it serve traffic?" — Kubernetes stops routing to the pod on failure) → `/actuator/health/readiness`
- **Service discovery is native**: Each service gets a Domain Name System (DNS) name (`http://order-service`) — this is why a Eureka-style registry becomes unnecessary in Kubernetes

### Resources & the Java Virtual Machine
- **Requests** (what the scheduler guarantees) vs **limits** (the hard ceiling) for processor and memory
- Exceeding the memory limit → the container is **OOMKilled** (Out Of Memory)
- Size the Java heap relative to the container, not with a fixed value: `-XX:MaxRAMPercentage=75.0` instead of a hard-coded `-Xmx`
- **Horizontal Pod Autoscaler**: Adds or removes pod replicas based on observed load (processor, memory, custom metrics)

### Commands
```bash
kubectl get nodes / pods / services
kubectl describe pod mypod    # events and state — first reflex when debugging
kubectl logs mypod
kubectl exec -it mypod -- sh
kubectl apply -f pod.yml
kubectl get pods --watch
kubectl delete -f pod.yml
```

---

## ☁️ Cloud

### 🟠 AWS

#### Computing
- **EC2**: Elastic Compute Cloud with autoscaling
- **Lambda**: Serverless functions, virtual functions, autoscalable, reactive
- **Batch**: Timed jobs
- **Lightsail**: Easy user friendly computing + services for quick startup

#### Storage
- **S3**: Simple Storage Service for objects
- **EBS**: Elastic Block Store for EC2
- **EFS**: Elastic File System
- **DynamoDB**: NoDB key/value based
- **DocumentDB**: NoDB MongoDB document based
- **RDS**: Relational DB service for MySQL, SQLServer, Oracle, Postgress, etc.
- **Aurora**: AWS Proprietary SQL DB engine

#### Networking
- **VPC**: Virtual Private Cloud
- **CloudFront**: Content Delivery Network
- **API Gateway**: API management service
- **Route 53**: DNS service
- **ELB**: Elastic Load Balancer

#### Monitoring
- **CloudWatch**: Metrics and monitoring
- **Quicksight**: Dashboard for analytics

#### Events
- **EventBridge**:  Event/cron based event trigger service

#### Containers
- **ECR**: Container repository
- **ECS**: Provisioned ec2 instances
- **Fargate**: Serverless container service
- **EKS**: Elastic Kubernetes service, orchestrator, management

#### CI/CD
- **CodeCommit**: Source control service
- **CodeBuild**: Build service
- **CodeDeploy**: Deployment service
- **CodePipeline**: CI/CD service

### 🔵 Azure

#### Mapping AWS Knowledge to Azure Equivalents
| Concept | AWS (what you know) | Azure (what they use) |
|---|---|---|
| Kubernetes | Elastic Kubernetes Service (EKS) | Azure Kubernetes Service (AKS) |
| Serverless containers | Elastic Container Service (ECS) / Fargate | Azure Container Apps |
| Functions | Lambda | Azure Functions |
| Object storage | Simple Storage Service (S3) | Blob Storage |
| Relational database | Relational Database Service (RDS) | Azure SQL Database / Database for PostgreSQL |
| Messaging | Simple Queue Service (SQS) / Simple Notification Service (SNS) | Service Bus (queues and topics) / Event Hubs (Kafka-like) |
| Secrets | Secrets Manager | Key Vault |
| Identity | Identity and Access Management (IAM) | Entra ID (formerly Azure Active Directory) + Managed Identities |
| Monitoring | CloudWatch | Azure Monitor + Application Insights |
| Continuous integration/delivery | CodePipeline / GitHub Actions | Azure DevOps Pipelines / GitHub Actions |

#### Talking Points for the Interview
- **Event Hubs exposes a Kafka-compatible endpoint**: existing Kafka producer and consumer code can often point at it with configuration changes only
- **Managed Identity**: No credentials in configuration files — Azure's answer to Identity and Access Management roles
- **Spring Cloud Azure**: Ready-made starters for Key Vault, Service Bus, Event Hubs, and the rest
- Honest positioning: "Deep AWS experience; cloud concept transfer — here is the mapping I have already studied"

---

## 🏢 Infrastructure as Code

### 🟣 Terraform
```hcl
provider "aws" {
  region = "us-east-1"
}

resource "aws_instance" "example" {
  ami           = "ami-0c55b159cbfafe1d0"
  instance_type = "t2.micro"
}
```

### Commands
```bash
terraform init
terraform validate
terraform plan
terraform apply
terraform destroy
```

---

## 📚 Git

### Concepts
- **Merging strategies**
- **Rebase vs Merge**
- **Cherry pick**

---

## 🔄 Jenkins
- **Jenkinsfile**: Descriptor file for configuring the pipeline
- **Pipeline block**: the complete script
- **Agent**: the agent that's going to run the pipeline
- **Stages**: Stages of the pipeline
- **Steps**: Steps in the stage
