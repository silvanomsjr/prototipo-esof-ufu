/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{html,js,cljs}"],
  theme: {
    extend: {
      backgroundImage: {
        'background-pizza': "url(/assets/background.png)"
      }
    },
  },
  plugins: [],
}

