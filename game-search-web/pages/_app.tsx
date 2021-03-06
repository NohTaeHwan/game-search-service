import '../styles/globals.css'
import type { AppProps } from 'next/app'
import BoardNavbar from "../components/BoardNavbar";
import SubCategoryNavbar from "../components/SubCategoryNavbar";
import BoardForm from "../components/BoardForm";

function MyApp({ Component, pageProps }: AppProps) {
  return <div>
  <Component {...pageProps} />
  </div>
}

export default MyApp
