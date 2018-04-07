const omit = require('ramda/src/omit');

const omitter = omit(['a', 'b'])

export function say(o) {
  console.log("Say: ", omitter(o))
}
