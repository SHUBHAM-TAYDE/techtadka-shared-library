def call(String imageName) {
    echo "Deploying container..."

    sh """
    docker stop techtadka || true
    docker rm techtadka || true
    docker run -d -p 80:80 --name techtadka ${imageName}
    """
}
