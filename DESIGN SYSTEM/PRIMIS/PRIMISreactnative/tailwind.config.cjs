/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    './src/**/*.tsx', 
  ],
  theme: {
    fontSize: {
      sm: 13,
      md: 30,
      lg: 35,
    },

    colors: {
      tranparent: 'transparent',

      black: '#000',
      white: 'FFF',

      yellow:{

      100:  '#D6B046'},

      brown: {
      200: '#574B40',
      600: '#6B625A'},
      
      gray: {
      300: '#FFFFFF',
      400: '#FFFFFF5e',
      500: '#ABAAAA54'},
    },
    
    extend: {
      fontFamily: {
        sans: 'Inter, sans-serif',
      },
    },
  },
  plugins: [],
}
