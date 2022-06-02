/** @type {import('next').NextConfig} */
const nextConfig = {
  reactStrictMode: true,

  async redirects() {
    return [
      {
        source: "/board",
        destination: "/board/free",
        permanent: true,
      }
    ]
  }
}

module.exports = nextConfig
